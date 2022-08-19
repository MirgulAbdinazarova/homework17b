package zadacha17a;

public abstract class DomestikAnimal {
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public DomestikAnimal(int weight,int age, String gender,String nickName){
        this.weight=weight;
        this.age=age;
        this.gender=gender;
        this.nickName=nickName;
    }
    public  void setWeight(int weight){
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }
    public  void setAge(int age){
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public  void setGender(String gender){
        this.gender=gender;
    }
    public String getGender() {
        return gender;
    }
    public  void  setNickName(String nickName){
        this.nickName=nickName;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "DomestikAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}