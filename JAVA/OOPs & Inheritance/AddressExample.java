//Given a String variable address, print the address if it is not null; otherwise, print the default address as "India".

import java.util.Optional;

class AddressExample {
    public static void main(String[] args) {

        String address = null;

        String result = Optional.ofNullable(address)
                                .orElse("India");

        System.out.println(result);
    }
}
