<?xml version="1.0" encoding="UTF-8"?>
<com:modelEntity xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:com="http://www.mslv.com/studio/core/model/common" xmlns:inv="http://www.mslv.com/studio/inventory/model/specification" xmlns="http://www.mslv.com/studio/inventory/model/specification" xsi:type="inv:RuleTriggerType" name="EWO_LINK_UPGRADE_RULESET_EXTENSION_POINT">
  <com:saveVersion>2</com:saveVersion>
  <com:id>7+LuApFzQ+KseK7CWpzjeA</com:id>
  <inv:placement>AFTER</inv:placement>
  <inv:point>
    <com:entity>WorkflowManager_completeActivity</com:entity>
    <com:entityType>rstp</com:entityType>
    <com:relationship>com.mslv.studio.inventory.ruleset.trigger.REL_POINT</com:relationship>
  </inv:point>
  <inv:ruleset>
    <com:entity>EWO_LINK_UPGRADE</com:entity>
    <com:entityType>ruleset</com:entityType>
    <com:relationship>com.mslv.studio.inventory.ruleset.trigger.REL_RULESET</com:relationship>
  </inv:ruleset>
</com:modelEntity>