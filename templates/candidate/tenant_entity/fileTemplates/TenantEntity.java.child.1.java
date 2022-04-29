#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.models.ids;#end
#set( $Id_class_name = "${Model_name}Id" )
import tech.clearcode.core.candidate_app_core.models.ids.BaseEntityId;
import ${PACKAGE_NAME}.business_logic.models.${Model_name};

import java.util.UUID;

/**
 * <p>Типизированный ID модели {@link ${Model_name}}.</p>
 */
public final class ${Id_class_name} extends BaseEntityId<${Model_name}, UUID> implements With${Id_class_name} {
    //region Ctor

    private ${Id_class_name}(UUID value) {

        super(value);
    }

    //endregion
    //region Static factories
    
    public static ${Id_class_name} empty() {

        return new ${Id_class_name}(null);
    }
    
    public static ${Id_class_name} of(With${Id_class_name} model) {

        return new ${Id_class_name}(model.get${Id_class_name}());
    }
    
    public static ${Id_class_name} of(UUID id) {

        return new ${Id_class_name}(id);
    }
    
    //endregion
    //region Public
    
    @Override
    public UUID get${Id_class_name}() {

        return this.get();
    }

    //endregion
}
