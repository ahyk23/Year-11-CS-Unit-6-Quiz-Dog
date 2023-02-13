public class Dog {
    private int age;
    private String name;
    private String color;

    public Dog(){
        age = 0;
        name = "";
        color = "";
    }
    public Dog(int a, String n, String c){
        age = a;
        name = n;
        color = c;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setColor(String c){
        color = c;
    }
    private void addOneAge(){
        age += 1;
    }
    public int birthday(){
        addOneAge();
        return age;
    }
    public String toString(){
        return "The dog is named " + name + " and is " + age + " years old. This dog is " + color + ".";
    }
}
