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

package tj.dokumenty.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link dokumenty_postavwikaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_postavwikaLocalService
 * @generated
 */
@ProviderType
public class dokumenty_postavwikaLocalServiceWrapper
	implements dokumenty_postavwikaLocalService,
		ServiceWrapper<dokumenty_postavwikaLocalService> {
	public dokumenty_postavwikaLocalServiceWrapper(
		dokumenty_postavwikaLocalService dokumenty_postavwikaLocalService) {
		_dokumenty_postavwikaLocalService = dokumenty_postavwikaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _dokumenty_postavwikaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dokumenty_postavwikaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _dokumenty_postavwikaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_postavwikaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_postavwikaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of dokumenty_postavwikas.
	*
	* @return the number of dokumenty_postavwikas
	*/
	@Override
	public int getdokumenty_postavwikasCount() {
		return _dokumenty_postavwikaLocalService.getdokumenty_postavwikasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dokumenty_postavwikaLocalService.getOSGiServiceIdentifier();
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
		return _dokumenty_postavwikaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dokumenty_postavwikaLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dokumenty_postavwikaLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the dokumenty_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty_postavwikas
	* @param end the upper bound of the range of dokumenty_postavwikas (not inclusive)
	* @return the range of dokumenty_postavwikas
	*/
	@Override
	public java.util.List<tj.dokumenty.postavwika.model.dokumenty_postavwika> getdokumenty_postavwikas(
		int start, int end) {
		return _dokumenty_postavwikaLocalService.getdokumenty_postavwikas(start,
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
		return _dokumenty_postavwikaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dokumenty_postavwikaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the dokumenty_postavwika to the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_postavwika the dokumenty_postavwika
	* @return the dokumenty_postavwika that was added
	*/
	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika adddokumenty_postavwika(
		tj.dokumenty.postavwika.model.dokumenty_postavwika dokumenty_postavwika) {
		return _dokumenty_postavwikaLocalService.adddokumenty_postavwika(dokumenty_postavwika);
	}

	/**
	* Creates a new dokumenty_postavwika with the primary key. Does not add the dokumenty_postavwika to the database.
	*
	* @param dokumenty_postavwika_id the primary key for the new dokumenty_postavwika
	* @return the new dokumenty_postavwika
	*/
	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika createdokumenty_postavwika(
		long dokumenty_postavwika_id) {
		return _dokumenty_postavwikaLocalService.createdokumenty_postavwika(dokumenty_postavwika_id);
	}

	/**
	* Deletes the dokumenty_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty_postavwika
	* @return the dokumenty_postavwika that was removed
	* @throws PortalException if a dokumenty_postavwika with the primary key could not be found
	*/
	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika deletedokumenty_postavwika(
		long dokumenty_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_postavwikaLocalService.deletedokumenty_postavwika(dokumenty_postavwika_id);
	}

	/**
	* Deletes the dokumenty_postavwika from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_postavwika the dokumenty_postavwika
	* @return the dokumenty_postavwika that was removed
	*/
	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika deletedokumenty_postavwika(
		tj.dokumenty.postavwika.model.dokumenty_postavwika dokumenty_postavwika) {
		return _dokumenty_postavwikaLocalService.deletedokumenty_postavwika(dokumenty_postavwika);
	}

	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika fetchdokumenty_postavwika(
		long dokumenty_postavwika_id) {
		return _dokumenty_postavwikaLocalService.fetchdokumenty_postavwika(dokumenty_postavwika_id);
	}

	/**
	* Returns the dokumenty_postavwika with the primary key.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty_postavwika
	* @return the dokumenty_postavwika
	* @throws PortalException if a dokumenty_postavwika with the primary key could not be found
	*/
	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika getdokumenty_postavwika(
		long dokumenty_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dokumenty_postavwikaLocalService.getdokumenty_postavwika(dokumenty_postavwika_id);
	}

	/**
	* Updates the dokumenty_postavwika in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_postavwika the dokumenty_postavwika
	* @return the dokumenty_postavwika that was updated
	*/
	@Override
	public tj.dokumenty.postavwika.model.dokumenty_postavwika updatedokumenty_postavwika(
		tj.dokumenty.postavwika.model.dokumenty_postavwika dokumenty_postavwika) {
		return _dokumenty_postavwikaLocalService.updatedokumenty_postavwika(dokumenty_postavwika);
	}

	@Override
	public dokumenty_postavwikaLocalService getWrappedService() {
		return _dokumenty_postavwikaLocalService;
	}

	@Override
	public void setWrappedService(
		dokumenty_postavwikaLocalService dokumenty_postavwikaLocalService) {
		_dokumenty_postavwikaLocalService = dokumenty_postavwikaLocalService;
	}

	private dokumenty_postavwikaLocalService _dokumenty_postavwikaLocalService;
}