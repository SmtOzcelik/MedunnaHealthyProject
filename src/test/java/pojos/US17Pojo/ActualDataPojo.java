package pojos.US17Pojo;

public class ActualDataPojo {

/*  {
        "createdBy": "string",
                "createdDate": "2022-12-08T16:07:28.717Z",
                "defaultValMax": "string",
                "defaultValMin": "string",
                "description": "string",
                "id": 0,
                "name": "string",
                "price": 0
    }*/

    private String createdBy;
    private String createdDate;
    private String name;
    private String description;
    private Integer id;
    private Integer price;
    private String defaultValMin;
    private String defaultValMax;

    public ActualDataPojo(String createdBy, String createdDate, String name, String description, Integer id, Integer price, String defaultValMin, String defaultValMax) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
    }

    public ActualDataPojo() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    @Override
    public String toString() {
        return "ActualData{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }
}
