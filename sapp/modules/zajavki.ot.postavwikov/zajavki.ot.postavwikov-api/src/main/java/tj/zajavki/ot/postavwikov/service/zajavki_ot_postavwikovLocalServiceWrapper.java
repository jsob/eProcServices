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

package tj.zajavki.ot.postavwikov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link zajavki_ot_postavwikovLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikovLocalService
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovLocalServiceWrapper
	implements zajavki_ot_postavwikovLocalService,
		ServiceWrapper<zajavki_ot_postavwikovLocalService> {
	public zajavki_ot_postavwikovLocalServiceWrapper(
		zajavki_ot_postavwikovLocalService zajavki_ot_postavwikovLocalService) {
		_zajavki_ot_postavwikovLocalService = zajavki_ot_postavwikovLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _zajavki_ot_postavwikovLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _zajavki_ot_postavwikovLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _zajavki_ot_postavwikovLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavki_ot_postavwikovLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavki_ot_postavwikovLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of zajavki_ot_postavwikovs.
	*
	* @return the number of zajavki_ot_postavwikovs
	*/
	@Override
	public int getzajavki_ot_postavwikovsCount() {
		return _zajavki_ot_postavwikovLocalService.getzajavki_ot_postavwikovsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _zajavki_ot_postavwikovLocalService.getOSGiServiceIdentifier();
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
		return _zajavki_ot_postavwikovLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _zajavki_ot_postavwikovLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _zajavki_ot_postavwikovLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the zajavki_ot_postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki_ot_postavwikovs
	* @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	* @return the range of zajavki_ot_postavwikovs
	*/
	@Override
	public java.util.List<tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov> getzajavki_ot_postavwikovs(
		int start, int end) {
		return _zajavki_ot_postavwikovLocalService.getzajavki_ot_postavwikovs(start,
			end);
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
		return _zajavki_ot_postavwikovLocalService.dynamicQueryCount(dynamicQuery);
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
		return _zajavki_ot_postavwikovLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the zajavki_ot_postavwikov to the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was added
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov addzajavki_ot_postavwikov(
		tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return _zajavki_ot_postavwikovLocalService.addzajavki_ot_postavwikov(zajavki_ot_postavwikov);
	}

	/**
	* Creates a new zajavki_ot_postavwikov with the primary key. Does not add the zajavki_ot_postavwikov to the database.
	*
	* @param zajavki_ot_postavwikov_id the primary key for the new zajavki_ot_postavwikov
	* @return the new zajavki_ot_postavwikov
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov createzajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id) {
		return _zajavki_ot_postavwikovLocalService.createzajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Deletes the zajavki_ot_postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was removed
	* @throws PortalException if a zajavki_ot_postavwikov with the primary key could not be found
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov deletezajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavki_ot_postavwikovLocalService.deletezajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Deletes the zajavki_ot_postavwikov from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was removed
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov deletezajavki_ot_postavwikov(
		tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return _zajavki_ot_postavwikovLocalService.deletezajavki_ot_postavwikov(zajavki_ot_postavwikov);
	}

	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov fetchzajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id) {
		return _zajavki_ot_postavwikovLocalService.fetchzajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Returns the zajavki_ot_postavwikov with the primary key.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov
	* @throws PortalException if a zajavki_ot_postavwikov with the primary key could not be found
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov getzajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _zajavki_ot_postavwikovLocalService.getzajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Updates the zajavki_ot_postavwikov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was updated
	*/
	@Override
	public tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov updatezajavki_ot_postavwikov(
		tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return _zajavki_ot_postavwikovLocalService.updatezajavki_ot_postavwikov(zajavki_ot_postavwikov);
	}

	@Override
	public zajavki_ot_postavwikovLocalService getWrappedService() {
		return _zajavki_ot_postavwikovLocalService;
	}

	@Override
	public void setWrappedService(
		zajavki_ot_postavwikovLocalService zajavki_ot_postavwikovLocalService) {
		_zajavki_ot_postavwikovLocalService = zajavki_ot_postavwikovLocalService;
	}

	private zajavki_ot_postavwikovLocalService _zajavki_ot_postavwikovLocalService;
}