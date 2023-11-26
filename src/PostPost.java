import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

import java.util.ArrayList;

public class PostPost implements PostOffice {

   private ArrayList<Package> packages = new ArrayList<>();

    @Override
    public void postPackage(Package aPackage) throws IllegalPackageException {

        if (aPackage.getPackageCode() == null || aPackage.getPackageCode().isEmpty() || aPackage.getOwner() == null || aPackage.getOwner().isEmpty()) {
            throw new IllegalPackageException();
        }

        if (!packages.contains(aPackage)) {
            packages.add(aPackage);
        }

//        if (aPackage != null) {
//            packages.add(aPackage);
//        }

    }

    @Override
    public long numberOfPackagesForOwner(String s) {

        long numberOfPackages = packages.stream().filter(a -> a.getOwner().equals(s)).count();
        return numberOfPackages;
    }

    @Override
    public Package retrievePackage(String s) {

//        if (s == null) {
//            return null;
//        }

        Package removedPac = packages.stream().filter(a -> a.getPackageCode().equals(s)).findFirst().orElse(null);
        packages.remove(removedPac);
        return removedPac;
    }
}
