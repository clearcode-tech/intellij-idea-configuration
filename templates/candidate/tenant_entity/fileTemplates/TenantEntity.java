#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.models;#end
#set( $Id_class_name = "${Model_name}Id" )
#if(1 == 0)${Name_in_Russian_genetive_decapitalized}#end
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;
import tech.clearcode.core.candidate_app_core.models.UuidBaseEntity;
import ${PACKAGE_NAME}.business_logic.models.ids.With${Id_class_name};

import javax.persistence.Entity;
import java.util.UUID;

/**
 * <p>${Name_in_Russian_Capitalized}.</p>
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@FieldNameConstants
@SuperBuilder(toBuilder = true)
@Entity
public final class ${Model_name} extends UuidBaseEntity implements With${Id_class_name} {
    //region Fields
    
    
    
    //endregion
    //region Public

    @Override
    public UUID get${Id_class_name}() {

        return this.getId();
    }

    //endregion
}
