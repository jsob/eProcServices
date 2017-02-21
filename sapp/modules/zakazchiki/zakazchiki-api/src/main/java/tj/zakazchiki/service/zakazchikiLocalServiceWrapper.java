/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.zakazchiki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link zakazchikiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see zakazchikiLocalService
 * @generated
 */
@ProviderType
public class zakazchikiLocalServiceWrapper implements zakazchikiLocalService,
	ServiceWrapper<zakazchikiLocalService> {
	public zakazchikiLocalServiceWrapper(
		zakazchikiLocalService zakazchikiLocalService) {
		_zakazchikiLocalService = zakazchikiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _zakazchikiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _zakazchikiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _zakazchikiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zakazchikiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zakazchikiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of zakazchikis.
	*
	* @return the number of zakazchikis
	*/
	@Override
	public int getzakazchikisCount() {
		return _zakazchikiLocalService.getzakazchikisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _zakazchikiLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _zakazchikiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zakazchiki.model.impl.zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _zakazchikiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zakazchiki.model.impl.zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _zakazchikiLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the zakazchikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zakazchiki.model.impl.zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zakazchikis
	* @param end the upper bound of the range of zakazchikis (not inclusive)
	* @return the range of zakazchikis
	*/
	@Override
	public java.util.List<tj.zakazchiki.model.zakazchiki> getzakazchikis(
		int start, int end) {
		return _zakazchikiLocalService.getzakazchikis(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _zakazchikiLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _zakazchikiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the zakazchiki to the database. Also notifies the appropriate model listeners.
	*
	* @param zakazchiki the zakazchiki
	* @return the zakazchiki that was added
	*/
	@Override
	public tj.zakazchiki.model.zakazchiki addzakazchiki(
		tj.zakazchiki.model.zakazchiki zakazchiki) {
		return _zakazchikiLocalService.addzakazchiki(zakazchiki);
	}

	/**
	* Creates a new zakazchiki with the primary key. Does not add the zakazchiki to the database.
	*
	* @param zakazchiki_id the primary key for the new zakazchiki
	* @return the new zakazchiki
	*/
	@Override
	public tj.zakazchiki.model.zakazchiki createzakazchiki(long zakazchiki_id) {
		return _zakazchikiLocalService.createzakazchiki(zakazchiki_id);
	}

	/**
	* Deletes the zakazchiki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zakazchiki_id the primary key of the zakazchiki
	* @return the zakazchiki that was removed
	* @throws PortalException if a zakazchiki with the primary key could not be found
	*/
	@Override
	public tj.zakazchiki.model.zakazchiki deletezakazchiki(long zakazchiki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zakazchikiLocalService.deletezakazchiki(zakazchiki_id);
	}

	/**
	* Deletes the zakazchiki from the database. Also notifies the appropriate model listeners.
	*
	* @param zakazchiki the zakazchiki
	* @return the zakazchiki that was removed
	*/
	@Override
	public tj.zakazchiki.model.zakazchiki deletezakazchiki(
		tj.zakazchiki.model.zakazchiki zakazchiki) {
		return _zakazchikiLocalService.deletezakazchiki(zakazchiki);
	}

	@Override
	public tj.zakazchiki.model.zakazchiki fetchzakazchiki(long zakazchiki_id) {
		return _zakazchikiLocalService.fetchzakazchiki(zakazchiki_id);
	}

	/**
	* Returns the zakazchiki with the primary key.
	*
	* @param zakazchiki_id the primary key of the zakazchiki
	* @return the zakazchiki
	* @throws PortalException if a zakazchiki with the primary key could not be found
	*/
	@Override
	public tj.zakazchiki.model.zakazchiki getzakazchiki(long zakazchiki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zakazchikiLocalService.getzakazchiki(zakazchiki_id);
	}

	/**
	* Updates the zakazchiki in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zakazchiki the zakazchiki
	* @return the zakazchiki that was updated
	*/
	@Override
	public tj.zakazchiki.model.zakazchiki updatezakazchiki(
		tj.zakazchiki.model.zakazchiki zakazchiki) {
		return _zakazchikiLocalService.updatezakazchiki(zakazchiki);
	}

	@Override
	public zakazchikiLocalService getWrappedService() {
		return _zakazchikiLocalService;
	}

	@Override
	public void setWrappedService(zakazchikiLocalService zakazchikiLocalService) {
		_zakazchikiLocalService = zakazchikiLocalService;
	}

	private zakazchikiLocalService _zakazchikiLocalService;
}