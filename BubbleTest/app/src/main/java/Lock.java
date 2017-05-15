import android.location.*;

/**
 * Created by Alxd on 15/05/2017.
 */

public class Lock {

    private String description;

    private String lockSerialNumber;

    private Address address;

    public Lock(String description, String lockSerialNumber, Address address) {
        this.description = description;
        this.lockSerialNumber = lockSerialNumber;
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLockSerialNumber() {
        return lockSerialNumber;
    }

    public void setLockSerialNumber(String lockSerialNumber) {
        this.lockSerialNumber = lockSerialNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
