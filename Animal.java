public class Animal {
    private String type;
    private char size;
    private int age;
    private String color;

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setSize(char size){
        this.size = size;
    }

    public char getSize(){
        return size;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    
    public static void main(String[] args){
        Animal Cat = new Animal();
        Animal Dog = new Animal();
        Animal Mouse = new Animal();
        Cat.setType("Cat");
        Dog.setType("Dog");
        Mouse.setType("Mouse");
        Cat.setAge(12);
        Mouse.setAge(22);
        Dog.setAge(33);
        Cat.setColor("Orange");
        Dog.setColor("Beige");
        Mouse.setColor("Grey");
        Cat.setSize('M');
        Dog.setSize('L');
        Mouse.setSize('S');
        System.out.println("ANIMAL 1");
        System.out.println("Type: " + Cat.getType());
        System.out.println("Size: " + Cat.getSize());
        System.out.println("Age: " + Cat.getAge());
        System.out.println("Color: " + Cat.getColor());
        System.out.println("-------------------------------------------------------------------");
        System.out.println("ANIMAL 2");
        System.out.println("Type: " + Dog.getType());
        System.out.println("Size: " + Dog.getSize());
        System.out.println("Age: " + Dog.getAge());
        System.out.println("Color: " + Dog.getColor());
        System.out.println("------------------------------------------------------------------");
        System.out.println("ANIMAL 3");
        System.out.println("Type: " + Mouse.getType());
        System.out.println("Size: " + Mouse.getSize());
        System.out.println("Age: " + Mouse.getAge());
        System.out.println("Color: " + Mouse.getColor());
    }
}


