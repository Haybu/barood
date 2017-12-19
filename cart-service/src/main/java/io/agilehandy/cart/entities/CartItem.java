package io.agilehandy.cart.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cart_item")
@IdClass(CartItemPK.class)
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private int cartId;
    private int productId;
    private int itemQty;
    private Timestamp lastUpdated;
    private Cart cartByCartId;

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "item_qty")
    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    @Basic
    @Column(name = "last_updated")
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartItem cartItem = (CartItem) o;

        if (cartId != cartItem.cartId) return false;
        if (productId != cartItem.productId) return false;
        if (itemQty != cartItem.itemQty) return false;
        if (lastUpdated != null ? !lastUpdated.equals(cartItem.lastUpdated) : cartItem.lastUpdated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + productId;
        result = 31 * result + itemQty;
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Cart getCartByCartId() {
        return cartByCartId;
    }

    public void setCartByCartId(Cart cartByCartId) {
        this.cartByCartId = cartByCartId;
    }
}
