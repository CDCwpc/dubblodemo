package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: demo-com.example.demo.entity
 * @author: WPC
 * @date: 2019-07-17 10:17
 */
@Data
@TableName("user")
public class UserEntity implements Serializable {
    private int id;
    private String name;
    private int age;
    private String email;
}
