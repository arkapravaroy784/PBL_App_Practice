import java.util.Optional;

class AddressExample {
    public static void main(String[] args) {

        String address = null;

        String result = Optional.ofNullable(address)
                                .orElse("India");

        System.out.println(result);
    }
}