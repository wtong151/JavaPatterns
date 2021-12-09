package com.company.create.prototype;

import com.company.create.prototype.prototypeAbs.BaseMessage;

import java.util.ArrayList;

/**
 * 〈原型模式---深拷贝〉<br>
 *
 * @className: DeepCopy
 * @package: com.company.create.prototype.prototypeAbs
 * @author: wangtong
 * @date: 2021/12/9 2:05 pm
 **/

public class DeepCopy extends BaseMessage implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = null;
        deepCopy = (DeepCopy) super.clone();
        this.setImgList((ArrayList<String>) this.getImgList().clone());
        return deepCopy;
    }
}
