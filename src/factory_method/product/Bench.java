package factory_method.product;

public class Bench extends Chair {

    @Override
    public void checkQuality() {
        System.out.println("벤치의 품질검증 수행 로직");
    }
}