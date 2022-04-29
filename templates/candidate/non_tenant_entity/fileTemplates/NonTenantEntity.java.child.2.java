#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.services.models;#end

import ${PACKAGE_NAME}.business_logic.models.${Model_name};
import ${PACKAGE_NAME}.business_logic.models.ids.${Model_name}Id;
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;
import tech.clearcode.core.candidate_app_core.services.models.ModelService;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.UUID;

/**
 * <p>Сервис модели {@link ${Model_name}}.</p>
 */
@Named
@Singleton
public final class ${Model_name}Service extends ModelService<${Model_name}, ${Model_name}Repository, ${Model_name}Id, UUID> {
    //region Ctor

    public ${Model_name}Service(${Model_name}Repository repository) {

        super(repository, ${Model_name}.class);
    }

    //endregion
    //region Public
    
    

    //endregion
}
