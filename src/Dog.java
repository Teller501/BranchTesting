public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood){
            System.out.println("logrer");
        }else{
            System.out.println("knurrer");
        }
    }
}
