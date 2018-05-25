package validate;


import validate.exception.ValidationException;

/**
 * 校验器
 * @author zhaomingjie
 */
public interface Validator {
    void validate(Object obj) throws ValidationException;
}
