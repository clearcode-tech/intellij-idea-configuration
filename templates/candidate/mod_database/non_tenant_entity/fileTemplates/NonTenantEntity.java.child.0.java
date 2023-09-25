#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.repositories_ebean;#end
#set( $Id_class_name = "${Model_name}Id" )
import ${PACKAGE_NAME}.business_logic.entities.databases.main.${Model_name};
import ${PACKAGE_NAME}.business_logic.entities.databases.main.ids. ${Id_class_name};
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;
import tech.clearcode.core.app_core.repositories_ebean.EbeanCrudRepository;
import tech.clearcode.core.app_core.repositories_ebean.EbeanDatabaseSupplier;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.UUID;

/**
 * <p>Репозиторий модели {@link ${Model_name}} на базе репозитория Ebean.</p>
 */
@Named
@Singleton
public final class Ebean${Model_name}Repository extends EbeanCrudRepository<${Model_name}, ${Id_class_name}, UUID> implements ${Model_name}Repository {
    //region Ctor
    
    @Inject
    private Ebean${Model_name}Repository(EbeanDatabaseSupplier ebeanDatabaseSupplier) {

        super(ebeanDatabaseSupplier.get(), ${Model_name}.class);
    }
    
    //endregion
}
