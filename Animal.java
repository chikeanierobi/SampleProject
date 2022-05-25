public class Animal {
    private String type;
    private char size;
    private int age;
    private String color;

    public void setInfo(String type, char size, int age, String color){
        this.type = type;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void printInfo(){
        if (size == 'S'){
            System.out.println("This animal is a " + age + "-year-old " +  type.toLowerCase() + " coloured " + color.toLowerCase() +  " and small in size.");
        }
        else if (size == 'M'){
            System.out.println("This animal is a " + age + "-year-old " +  type.toLowerCase() + " coloured " + color.toLowerCase() +  " and medium in size.");
        }
        else if (size == 'L'){
            System.out.println("This animal is a " + age + "-year-old " +  type.toLowerCase() + " coloured " + color.toLowerCase() +  " and large in size.");
        }
    }
    
    
    public static void main(String[] args){
        Animal Cat = new Animal();
        Animal Dog = new Animal();
        Animal Mouse = new Animal();
        Cat.setInfo("Cat",'M',12,"Orange");
        Dog.setInfo("Dog",'L',33,"Beige");
        Mouse.setInfo("Mouse",'S',6,"White");
        Cat.printInfo();
        Dog.printInfo();
        Mouse.printInfo();
    }
}


