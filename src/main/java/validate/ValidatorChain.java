package validate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import validate.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 校验链
 * @author zhaomingjie
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ValidatorChain implements Validator {

    private List<Validator> validators;

    @Override
    public void validate(Object model) throws ValidationException {
        Optional<List<Validator>> optionalValidators = Optional.ofNullable(validators);
        List<Validator> validators = optionalValidators.orElse(new ArrayList());
        for (Validator v:validators) {
            v.validate(model);
        }
    }

}
