package abstract_factory.product;

public class PlasticTable implements Table {

    @Override
    public void selfIntroduce() {
        System.out.println("저는 플라스틱 식탁입니다.");
    }
}
