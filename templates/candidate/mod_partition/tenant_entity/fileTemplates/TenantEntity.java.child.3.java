#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.services.entities;#end
#set( $Id_class_name = "${Model_name}Id" )
import ${PACKAGE_NAME}.business_logic.entities.${Model_name};
import ${PACKAGE_NAME}.business_logic.entities.ids.$Id_class_name;
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;
import tech.clearcode.core.app_core.multitenancy.mode_partition.services.entities.TenantEntityService;
import tech.clearcode.core.app_core.multitenancy.services.TenantReferenceService;
import tech.clearcode.core.app_core.repositories.TransactionProvider;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.util.UUID;

/**
 * Сервис модели {@link ${Model_name}}.
 */
@Named
@Singleton
public final class ${Model_name}Service
    extends TenantEntityService<${Model_name}, $Id_class_name, ${Model_name}Repository, UUID> {
    //region Ctor

    @Inject
    public ${Model_name}Service(
        ${Model_name}Repository repository,
        TransactionProvider transactionProvider,
        TenantReferenceService tenantReferenceService
    ) {
        super(repository, transactionProvider, tenantReferenceService, ${Model_name}.class);
    }

    //endregion
    //region Public
    
    

    //endregion
}
