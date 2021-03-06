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

package tj.izvewenija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link izvewenijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see izvewenijaLocalService
 * @generated
 */
@ProviderType
public class izvewenijaLocalServiceWrapper implements izvewenijaLocalService,
	ServiceWrapper<izvewenijaLocalService> {
	public izvewenijaLocalServiceWrapper(
		izvewenijaLocalService izvewenijaLocalService) {
		_izvewenijaLocalService = izvewenijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _izvewenijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _izvewenijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _izvewenijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of izvewenijas.
	*
	* @return the number of izvewenijas
	*/
	@Override
	public int getizvewenijasCount() {
		return _izvewenijaLocalService.getizvewenijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _izvewenijaLocalService.getOSGiServiceIdentifier();
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
		return _izvewenijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenija.model.impl.izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _izvewenijaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenija.model.impl.izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _izvewenijaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenija.model.impl.izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of izvewenijas
	*/
	@Override
	public java.util.List<tj.izvewenija.model.izvewenija> getizvewenijas(
		int start, int end) {
		return _izvewenijaLocalService.getizvewenijas(start, end);
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
		return _izvewenijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _izvewenijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the izvewenija to the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija the izvewenija
	* @return the izvewenija that was added
	*/
	@Override
	public tj.izvewenija.model.izvewenija addizvewenija(
		tj.izvewenija.model.izvewenija izvewenija) {
		return _izvewenijaLocalService.addizvewenija(izvewenija);
	}

	/**
	* Creates a new izvewenija with the primary key. Does not add the izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new izvewenija
	* @return the new izvewenija
	*/
	@Override
	public tj.izvewenija.model.izvewenija createizvewenija(long izvewenija_id) {
		return _izvewenijaLocalService.createizvewenija(izvewenija_id);
	}

	/**
	* Deletes the izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija that was removed
	* @throws PortalException if a izvewenija with the primary key could not be found
	*/
	@Override
	public tj.izvewenija.model.izvewenija deleteizvewenija(long izvewenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenijaLocalService.deleteizvewenija(izvewenija_id);
	}

	/**
	* Deletes the izvewenija from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija the izvewenija
	* @return the izvewenija that was removed
	*/
	@Override
	public tj.izvewenija.model.izvewenija deleteizvewenija(
		tj.izvewenija.model.izvewenija izvewenija) {
		return _izvewenijaLocalService.deleteizvewenija(izvewenija);
	}

	@Override
	public tj.izvewenija.model.izvewenija fetchizvewenija(long izvewenija_id) {
		return _izvewenijaLocalService.fetchizvewenija(izvewenija_id);
	}

	/**
	* Returns the izvewenija with the primary key.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija
	* @throws PortalException if a izvewenija with the primary key could not be found
	*/
	@Override
	public tj.izvewenija.model.izvewenija getizvewenija(long izvewenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenijaLocalService.getizvewenija(izvewenija_id);
	}

	/**
	* Updates the izvewenija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param izvewenija the izvewenija
	* @return the izvewenija that was updated
	*/
	@Override
	public tj.izvewenija.model.izvewenija updateizvewenija(
		tj.izvewenija.model.izvewenija izvewenija) {
		return _izvewenijaLocalService.updateizvewenija(izvewenija);
	}

	@Override
	public izvewenijaLocalService getWrappedService() {
		return _izvewenijaLocalService;
	}

	@Override
	public void setWrappedService(izvewenijaLocalService izvewenijaLocalService) {
		_izvewenijaLocalService = izvewenijaLocalService;
	}

	private izvewenijaLocalService _izvewenijaLocalService;
}