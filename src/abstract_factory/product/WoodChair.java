package abstract_factory.product;

public class WoodChair implements Chair{

    @Override
    public void selfIntroduce() {
        System.out.println("저는 나무 의자입니다.");
    }
}
