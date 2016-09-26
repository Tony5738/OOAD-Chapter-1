public class Guitar {

    private String serialNumber;
    private Builder builder;
    private String model;
    private String type;
    private Wood backWood;
    private Wood topWood;
    private double price;

    public Guitar(String serialNumber, double price,
                  Builder builder, String model, String type,
                  Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
      }

    public double getPrice() {
        return price;
      }
    public void setPrice(float newPrice) {
        this.price = newPrice;
      }
    public Builder getBuilder() {
        return builder;
      }
    public String getModel() {
        return model;
      }
    public String getType() {
        return type;
      }
    public Wood getBackWood() {
        return backWood;
      }
    public Wood getTopWood() {
        return topWood;
      }
}
