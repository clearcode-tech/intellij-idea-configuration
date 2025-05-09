#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.entities;#end
#set( $Id_class_name = "${Model_name}Id" )
#if(1 == 0)${Name_in_Russian_genetive_decapitalized}#end
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;
import tech.clearcode.core.app_core.multitenancy.mode_partition.entities.UuidBaseTenantEntity;
import ${PACKAGE_NAME}.business_logic.entities.ids.With${Id_class_name};

import jakarta.persistence.Entity;
import java.util.UUID;

/**
 * ${Name_in_Russian_Capitalized}.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@FieldNameConstants
@SuperBuilder(toBuilder = true)
@Entity
public final class ${Model_name} extends UuidBaseTenantEntity implements With${Id_class_name} {
    //region Fields
    
    
    
    //endregion
    //region Public

    @Override
    public UUID get${Id_class_name}() {

        return this.getId();
    }

    //endregion
}
