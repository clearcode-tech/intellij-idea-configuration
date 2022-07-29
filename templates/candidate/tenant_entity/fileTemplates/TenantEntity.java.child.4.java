#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.repositories_ebean;#end
#set( $Id_class_name = "${Model_name}Id" )
import ${PACKAGE_NAME}.business_logic.entities.database_groups.main.${Model_name};
import ${PACKAGE_NAME}.business_logic.entities.database_groups.main.ids.$Id_class_name;
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;
import tech.clearcode.core.app_core.multitenancy.repositories_ebean.EbeanTenantCrudRepository;
import tech.clearcode.core.app_core.multitenancy.repositories_ebean.EbeanTenantDatabaseSupplier;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.UUID;

/**
 * <p>Репозиторий модели {@link ${Model_name}} на базе репозитория Ebean.</p>
 */
@Named
@Singleton
public final class Ebean${Model_name}Repository extends EbeanTenantCrudRepository<${Model_name}, $Id_class_name, UUID> implements ${Model_name}Repository {
    //region Ctor
    
    @Inject
    private Ebean${Model_name}Repository(EbeanTenantDatabaseSupplier ebeanTenantDatabaseSupplier) {

        super(ebeanTenantDatabaseSupplier, ${Model_name}.class);
    }
    
    //endregion
}
