public class Main {
    private String name; //定义一个成员变量
    public String getName(){
        setName("changruiqi");
        return this.name;
    }
    private void setName(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Main rect = new Main();
        System.out.print(rect.getName());
    }
}

