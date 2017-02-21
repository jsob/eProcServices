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

package tj.tipy.dokumentov.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link tipy_dokumentov_postavwikaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwikaLocalService
 * @generated
 */
@ProviderType
public class tipy_dokumentov_postavwikaLocalServiceWrapper
	implements tipy_dokumentov_postavwikaLocalService,
		ServiceWrapper<tipy_dokumentov_postavwikaLocalService> {
	public tipy_dokumentov_postavwikaLocalServiceWrapper(
		tipy_dokumentov_postavwikaLocalService tipy_dokumentov_postavwikaLocalService) {
		_tipy_dokumentov_postavwikaLocalService = tipy_dokumentov_postavwikaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tipy_dokumentov_postavwikaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tipy_dokumentov_postavwikaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tipy_dokumentov_postavwikaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_dokumentov_postavwikaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_dokumentov_postavwikaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of tipy_dokumentov_postavwikas.
	*
	* @return the number of tipy_dokumentov_postavwikas
	*/
	@Override
	public int gettipy_dokumentov_postavwikasCount() {
		return _tipy_dokumentov_postavwikaLocalService.gettipy_dokumentov_postavwikasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tipy_dokumentov_postavwikaLocalService.getOSGiServiceIdentifier();
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
		return _tipy_dokumentov_postavwikaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipy_dokumentov_postavwikaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipy_dokumentov_postavwikaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the tipy_dokumentov_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_dokumentov_postavwikas
	* @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	* @return the range of tipy_dokumentov_postavwikas
	*/
	@Override
	public java.util.List<tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika> gettipy_dokumentov_postavwikas(
		int start, int end) {
		return _tipy_dokumentov_postavwikaLocalService.gettipy_dokumentov_postavwikas(start,
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
		return _tipy_dokumentov_postavwikaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tipy_dokumentov_postavwikaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the tipy_dokumentov_postavwika to the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika that was added
	*/
	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika addtipy_dokumentov_postavwika(
		tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		return _tipy_dokumentov_postavwikaLocalService.addtipy_dokumentov_postavwika(tipy_dokumentov_postavwika);
	}

	/**
	* Creates a new tipy_dokumentov_postavwika with the primary key. Does not add the tipy_dokumentov_postavwika to the database.
	*
	* @param tipy_dokumentov_postavwika_id the primary key for the new tipy_dokumentov_postavwika
	* @return the new tipy_dokumentov_postavwika
	*/
	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika createtipy_dokumentov_postavwika(
		long tipy_dokumentov_postavwika_id) {
		return _tipy_dokumentov_postavwikaLocalService.createtipy_dokumentov_postavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Deletes the tipy_dokumentov_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika that was removed
	* @throws PortalException if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika deletetipy_dokumentov_postavwika(
		long tipy_dokumentov_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_dokumentov_postavwikaLocalService.deletetipy_dokumentov_postavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Deletes the tipy_dokumentov_postavwika from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika that was removed
	*/
	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika deletetipy_dokumentov_postavwika(
		tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		return _tipy_dokumentov_postavwikaLocalService.deletetipy_dokumentov_postavwika(tipy_dokumentov_postavwika);
	}

	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika fetchtipy_dokumentov_postavwika(
		long tipy_dokumentov_postavwika_id) {
		return _tipy_dokumentov_postavwikaLocalService.fetchtipy_dokumentov_postavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Returns the tipy_dokumentov_postavwika with the primary key.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika
	* @throws PortalException if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika gettipy_dokumentov_postavwika(
		long tipy_dokumentov_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_dokumentov_postavwikaLocalService.gettipy_dokumentov_postavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Updates the tipy_dokumentov_postavwika in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika that was updated
	*/
	@Override
	public tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika updatetipy_dokumentov_postavwika(
		tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		return _tipy_dokumentov_postavwikaLocalService.updatetipy_dokumentov_postavwika(tipy_dokumentov_postavwika);
	}

	@Override
	public tipy_dokumentov_postavwikaLocalService getWrappedService() {
		return _tipy_dokumentov_postavwikaLocalService;
	}

	@Override
	public void setWrappedService(
		tipy_dokumentov_postavwikaLocalService tipy_dokumentov_postavwikaLocalService) {
		_tipy_dokumentov_postavwikaLocalService = tipy_dokumentov_postavwikaLocalService;
	}

	private tipy_dokumentov_postavwikaLocalService _tipy_dokumentov_postavwikaLocalService;
}