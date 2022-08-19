package zadacha17a;

public  class Farm {

    private String address;
    private String ownerName;
    private Cow[] cows;
     private Sheep[] sheep;
     private Horse [] horses;

    public Farm(String address,String ownerName,Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
        this.ownerName=ownerName;
        this.address=address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }
}










