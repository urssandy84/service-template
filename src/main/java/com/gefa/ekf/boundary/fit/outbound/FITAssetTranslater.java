package com.gefa.ekf.boundary.fit.outbound;

import com.gefa.ekf.application.domain.Asset;
import com.gefa.ekf.application.domain.events.AssetCreatedEvent;
import com.gefa.ekf.boundary.fit.domain.FITAsset;

public class FITAssetTranslater {

	public FITAsset toFITAsset(AssetCreatedEvent assetCreatedEvent) {
		return new FITAsset();
	}

	public Asset fromFITAsset(FITAsset fitAsset) {
		return null;
	}

}