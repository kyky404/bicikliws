package entity;

public class WheelDiameterEntity {
    public int Id;
    public String Name;

    public WheelDiameterEntity() {
    }

    public WheelDiameterEntity(int id, String name) {
        Id = id;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
