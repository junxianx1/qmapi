package demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("junxianx1")
public class junxianx1 {

    private int id;
    private  String name;
    private  String price;
    private  String inventory;
    private  String describe;
}
