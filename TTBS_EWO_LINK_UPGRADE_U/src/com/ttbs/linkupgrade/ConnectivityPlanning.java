package com.ttbs.linkupgrade;


	import java.util.List;

	import oracle.communications.inventory.api.businessinteraction.ActivityModel;
	import oracle.communications.inventory.api.businessinteraction.WorkflowManager;
	import oracle.communications.inventory.api.connectivity.ConnectivityEndpoint;
	import oracle.communications.inventory.api.connectivity.ConnectivitySearchCriteria;
	import oracle.communications.inventory.api.connectivity.TDMConnectivityManager;
	import oracle.communications.inventory.api.connectivity.impl.PipeHelper;
	import oracle.communications.inventory.api.entity.Activity;
	import oracle.communications.inventory.api.entity.ActivityCharacteristic;
	import oracle.communications.inventory.api.entity.AssignmentState;
	import oracle.communications.inventory.api.entity.BusinessInteraction;
	import oracle.communications.inventory.api.entity.BusinessInteractionAttachment;
	import oracle.communications.inventory.api.entity.BusinessInteractionState;
	import oracle.communications.inventory.api.entity.Connectivity;
	import oracle.communications.inventory.api.entity.ConnectivityFunction;
	import oracle.communications.inventory.api.entity.ConnectivityIdentifierFormat;
	import oracle.communications.inventory.api.entity.DeviceInterface;
	import oracle.communications.inventory.api.entity.NetworkConnectivity;
	import oracle.communications.inventory.api.entity.Pipe;
	import oracle.communications.inventory.api.entity.PipeConfigurationItem;
	import oracle.communications.inventory.api.entity.PipeConfigurationVersion;
	import oracle.communications.inventory.api.entity.PipeSpecification;
	import oracle.communications.inventory.api.entity.RateCode;
	import oracle.communications.inventory.api.entity.Technology;
	import oracle.communications.inventory.api.entity.common.TDMConnectivity;
	import oracle.communications.inventory.api.exception.ValidationException;
	import oracle.communications.inventory.api.framework.logging.Log;
	import oracle.communications.inventory.api.framework.logging.LogFactory;
	import oracle.communications.inventory.api.framework.security.UserEnvironment;
	import oracle.communications.inventory.api.framework.security.UserEnvironmentFactory;
	import oracle.communications.inventory.api.logicaldevice.DeviceInterfaceSearchCriteria;
	import oracle.communications.inventory.api.logicaldevice.LogicalDeviceManager;
	import oracle.communications.inventory.api.util.Utils;
	import oracle.communications.inventory.extensibility.extension.util.ExtensionPointRuleContext;
	import oracle.communications.platform.persistence.CriteriaItem;
	import oracle.communications.platform.persistence.CriteriaOperator;
	import oracle.communications.platform.persistence.Finder;
	import oracle.communications.platform.persistence.PersistenceHelper;

	public class ConnectivityPlanning {
		private static final Log log = LogFactory.getLog(ConnectivityPlanning.class);

		public void createConnectivity(ExtensionPointRuleContext context) {
			try {

				UserEnvironment userEnv = UserEnvironmentFactory.getUserEnvironment();

				BusinessInteraction businessInteraction = (BusinessInteraction) userEnv.getBusinessInteraction();
				String user = UserEnvironmentFactory.getUserEnvironment().getUser();
				Activity act = (Activity) context.getArguments()[0];
				WorkflowManager wmgr = PersistenceHelper.makeWorkflowManager();
				List<Activity> activityList = wmgr.getAssociatedActivities(businessInteraction);
				List<ActivityModel> actModelList = null;
				List<BusinessInteractionAttachment> biAttachments = businessInteraction.getAttachments();

				System.out.println("Connectivity Started................");

				String AEndInfo = null;
				String ZEndInfo = null;
				String RingInfo = null;
				String AEndPortInfo = null;
				String ZEndPortInfo = null;
				

				for (ActivityCharacteristic characterstic : act.getCharacteristics()) {
					System.out.println("=>" + characterstic.getName() + " - " + characterstic.getValue());
					if (characterstic.getName().equalsIgnoreCase("AEndInfo")) {
						AEndInfo = characterstic.getValue();
					}
					if (characterstic.getName().equalsIgnoreCase("ZEndInfo")) {
						ZEndInfo = characterstic.getValue();
					}
					if (characterstic.getName().equalsIgnoreCase("RingInfo")) {
						RingInfo = characterstic.getValue();
					}
					if (characterstic.getName().equalsIgnoreCase("AEndPortInfo")) {
						AEndPortInfo = characterstic.getValue();
					}
					if (characterstic.getName().equalsIgnoreCase("ZEndPortInfo")) {
						ZEndPortInfo = characterstic.getValue();
					}
					
				}

			//	connectivityPlanning(AEndInfo, ZEndInfo, RingInfo, AEndPortInfo, ZEndPortInfo);

				System.out.print(AEndInfo);
				System.out.print(ZEndInfo);
				System.out.print(RingInfo);
				System.out.print(AEndPortInfo);
				System.out.print(ZEndPortInfo);
			} catch (Exception e) {
				System.out.println("ERROR: " + e.getMessage());
				e.printStackTrace();
			} finally {

			}
}

//		private void connectivityPlanning(String aEndInfo, String zEndInfo, String ringInfo, String aEndPortInfo,
//				String zEndPortInfo) {
			// TODO Auto-generated method stub
			
		//}

		
	}

		
