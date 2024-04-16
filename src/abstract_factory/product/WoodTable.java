package abstract_factory.product;

public class WoodTable implements Table {

    @Override
    public void selfIntroduce() {
        System.out.println("저는 나무 식탁입니다.");
    }
}
