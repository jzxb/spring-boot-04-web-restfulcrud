package org.lhx.springboot.exception;

/**
 * @author lhx
 * @date 2019/4/15 - 16:37
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
