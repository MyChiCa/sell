package com.gittoy.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * OrderDetail
 * Create By GaoYu 2017/11/15 8:37
 */
@Entity
@Data
public class OrderDetail {

    /** 详情id */
    @Id
    private String detailId;

    /** 订单id */
    private String orderId;

    /** 商品id */
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 商品价格，单位分 */
    private BigDecimal productPrice;

    /** 数量 */
    private Integer productQuantity;

    /** 小图 */
    private String productIcon;

}

/** ------------------------------------------------------------------

 -- 订单详情
 create table `order_detail` (
 `detail_id` varchar(32) not null,
 `order_id` varchar(32) not null,
 `product_id` varchar(32) not null,
 `product_name` varchar(64) not null comment '商品名称',
 `product_price` decimal(8,2) not null comment '当前价格，单位分',
 `product_quantity` int not null comment '数量',
 `product_icon` varchar(512) comment '小图',
 `create_time` timestamp not null default current_timestamp comment '创建时间',
 `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
 primary key (`detail_id`),
 key `idx_order_id` (`order_id`)
 ) comment '订单详情表';

 ------------------------------------------------------------------*/