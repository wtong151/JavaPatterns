package com.company.create.prototype;

import com.company.create.prototype.prototypeAbs.BaseMessage;

/**
 * 〈原型模式--浅拷贝〉<br>
 *
 * @className: ShallowCopy
 * @package: com.company.create.prototype
 * @author: wangtong
 * @date: 2021/12/9 2:10 pm
 **/

public class ShallowCopy extends BaseMessage implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy = null;

        shallowCopy = (ShallowCopy) super.clone();

        return shallowCopy;
    }
}
