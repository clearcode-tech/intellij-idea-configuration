#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.repositories_ebean;#end
#set( $Id_class_name = "${Model_name}Id" )
import ${PACKAGE_NAME}.business_logic.entities.${Model_name};
import ${PACKAGE_NAME}.business_logic.entities.ids.$Id_class_name;
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;
import tech.clearcode.core.app_core.multitenancy.mode_partition.repositories_ebean.EbeanTenantCrudRepository;
import tech.clearcode.core.app_core.repositories_ebean.EbeanDatabaseSupplier;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.util.UUID;

/**
 * Репозиторий модели {@link ${Model_name}} на базе репозитория Ebean.
 */
@Named
@Singleton
public final class Ebean${Model_name}Repository
    extends EbeanTenantCrudRepository<${Model_name}, $Id_class_name, UUID>
    implements ${Model_name}Repository {
    //region Ctor
    
    @Inject
    private Ebean${Model_name}Repository(EbeanDatabaseSupplier ebeanDatabaseSupplier) {

        super(ebeanDatabaseSupplier.get(), ${Model_name}.class);
    }
    
    //endregion
}
