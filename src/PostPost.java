import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

public class PostPost implements PostOffice {
    @Override
    public void postPackage(Package aPackage) throws IllegalPackageException {
        
    }

    @Override
    public long numberOfPackagesForOwner(String s) {
        return 0;
    }

    @Override
    public Package retrievePackage(String s) {
        return null;
    }
}
