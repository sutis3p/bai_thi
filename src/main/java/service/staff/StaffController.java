package service.staff;

import model.Staff;

import java.util.Collection;


public interface StaffController {
    Collection<Staff> showAll();

    void create(Staff staff);


    Staff showByIndex(int index);

    void update(Staff staff);

    void delete(int index);
}