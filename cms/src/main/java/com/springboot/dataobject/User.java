package com.springboot.dataobject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created by Administrator on 2018/9/27 0027.
 */

@Data
public class User {

    @Id
    private Integer user_id;
    private Integer employee_id;
    private String emm_password;
}
