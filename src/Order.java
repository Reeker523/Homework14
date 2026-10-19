import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ[покупатель=" + customer
                + ", корзина=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Order order = (Order) obj;

        if (!Objects.equals(customer, order.customer)) {
            return false;
        }

        if (basket == order.basket) {
            return true;
        }

        if (basket == null || order.basket == null) {
            return false;
        }

        if (basket.length != order.basket.length) {
            return false;
        }

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                if (order.basket[i] != null) {
                    return false;
                }
            } else if (!basket[i].equals(order.basket[i])) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hashCode(customer)
                + Arrays.hashCode(basket);
    }
}