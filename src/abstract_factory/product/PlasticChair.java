package abstract_factory.product;

public class PlasticChair implements Chair{

    @Override
    public void selfIntroduce() {
        System.out.println("저는 플라스틱 의자입니다.");
    }
}
