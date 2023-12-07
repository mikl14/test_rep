package dto;

public class House
{
    public int number;
    protected String address;
    int floors;
    private String materials;

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", address='" + address + '\'' +
                ", floors=" + floors +
                ", materials='" + materials + '\'' +
                '}';
    }
}
