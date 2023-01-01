/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 14:14
 */
public class Orders {
    String id;
    String time;
    float money;
    String buyers;
    String seller;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getBuyers() {
        return buyers;
    }

    public void setBuyers(String buyers) {
        this.buyers = buyers;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", money=" + money +
                ", buyers='" + buyers + '\'' +
                ", seller='" + seller + '\'' +
                '}';
    }
}
