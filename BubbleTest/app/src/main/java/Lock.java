import android.location.*;

import java.security.acl.Owner;

/**
 * Created by Alxd on 15/05/2017.
 */

public class Lock {

    private String lockId;

    private String description;

    private String lockSerialNumber;

    private Address address;

    private User owner;

    public Lock(String lockId, String description, String lockSerialNumber, Address address, User owner) {
        this.lockId = lockId;
        this.description = description;
        this.lockSerialNumber = lockSerialNumber;
        this.address = address;
        this.owner = owner;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
