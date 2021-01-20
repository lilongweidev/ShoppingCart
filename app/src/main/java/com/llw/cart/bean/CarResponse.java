package com.llw.cart.bean;

import java.util.List;

/**
 * 购物车返回数据
 * @author llw
 */
public class CarResponse {


    /**
     * code : 200
     * orderData : [{"shopId":1,"shopName":"京东自营","cartlist":[{"id":1,"shopId":1,"shopName":"京东自营","defaultPic":"https://img30.360buyimg.com/popWareDetail/jfs/t3208/194/7616404169/244198/369625db/58b7d093N03520fb7.jpg","productId":1,"productName":"三只松鼠_零食大礼包","color":"黑色","size":"18L","price":20,"count":1},{"id":2,"shopId":1,"shopName":"京东自营","defaultPic":"https://img14.360buyimg.com/n0/jfs/t2971/15/167732091/93002/204c1016/574d9d9aNe4e6fa7a.jpg","productId":2,"productName":"小米心跳手环","color":"白色","size":"20XXL","price":148,"count":1}]},{"shopId":2,"shopName":"海澜之家","cartlist":[{"id":1,"shopId":2,"shopName":"海澜之家","defaultPic":"https://img30.360buyimg.com/popWaterMark/jfs/t4075/83/1343091204/132469/9034cb9c/5873496bN68020ba8.jpg","productId":1,"productName":"短袖T恤男 2017夏季新品","color":"蓝色","size":"30X","price":181,"count":1}]},{"shopId":3,"shopName":"OPPO官方旗舰店","cartlist":[{"id":1,"shopId":3,"shopName":"OPPO官方旗舰店","defaultPic":"https://img10.360buyimg.com/cms/jfs/t6064/272/2163314583/157700/442d6477/593c1c49N7c63a7d9.jpg","productId":1,"productName":"OPPO R11 全网通","color":"蓝色","size":"30X","price":1999,"count":1},{"id":2,"shopId":3,"shopName":"OPPO官方旗舰店","defaultPic":"https://img14.360buyimg.com/n0/jfs/t3142/194/4953241722/254855/1651c2b1/585b9021Nf653e48a.jpg","productId":1,"productName":"OPPO R9 全网通","color":"蓝色","size":"30X","price":999,"count":1}]}]
     */


    private int code;
    private List<OrderDataBean> orderData;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<OrderDataBean> getOrderData() {
        return orderData;
    }

    public void setOrderData(List<OrderDataBean> orderData) {
        this.orderData = orderData;
    }

    public static class OrderDataBean {
        /**
         * shopId : 1
         * shopName : 京东自营
         * cartlist : [{"id":1,"shopId":1,"shopName":"京东自营","defaultPic":"https://img30.360buyimg.com/popWareDetail/jfs/t3208/194/7616404169/244198/369625db/58b7d093N03520fb7.jpg","productId":1,"productName":"三只松鼠_零食大礼包","color":"黑色","size":"18L","price":20,"count":1},{"id":2,"shopId":1,"shopName":"京东自营","defaultPic":"https://img14.360buyimg.com/n0/jfs/t2971/15/167732091/93002/204c1016/574d9d9aNe4e6fa7a.jpg","productId":2,"productName":"小米心跳手环","color":"白色","size":"20XXL","price":148,"count":1}]
         */

        private int shopId;
        private String shopName;
        private List<CartlistBean> cartlist;
        private boolean isChecked;//店铺是否选中

        public int getShopId() {
            return shopId;
        }

        public void setShopId(int shopId) {
            this.shopId = shopId;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public List<CartlistBean> getCartlist() {
            return cartlist;
        }

        public void setCartlist(List<CartlistBean> cartlist) {
            this.cartlist = cartlist;
        }

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public static class CartlistBean {
            /**
             * id : 1
             * shopId : 1
             * shopName : 京东自营
             * defaultPic : https://img30.360buyimg.com/popWareDetail/jfs/t3208/194/7616404169/244198/369625db/58b7d093N03520fb7.jpg
             * productId : 1
             * productName : 三只松鼠_零食大礼包
             * color : 黑色
             * size : 18L
             * price : 20
             * count : 1
             */

            private int id;
            private int shopId;
            private String shopName;
            private String defaultPic;
            private int productId;
            private String productName;
            private String color;
            private String size;
            private int price;
            private int count;
            private boolean isChecked;//商品是否选中

            public boolean isChecked() {
                return isChecked;
            }

            public void setChecked(boolean checked) {
                isChecked = checked;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getShopId() {
                return shopId;
            }

            public void setShopId(int shopId) {
                this.shopId = shopId;
            }

            public String getShopName() {
                return shopName;
            }

            public void setShopName(String shopName) {
                this.shopName = shopName;
            }

            public String getDefaultPic() {
                return defaultPic;
            }

            public void setDefaultPic(String defaultPic) {
                this.defaultPic = defaultPic;
            }

            public int getProductId() {
                return productId;
            }

            public void setProductId(int productId) {
                this.productId = productId;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }
    }
}
