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

package tj.podtverzhdenie.na.uchastie.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link podtverzhdenie_na_uchastieLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_na_uchastieLocalService
 * @generated
 */
@ProviderType
public class podtverzhdenie_na_uchastieLocalServiceWrapper
	implements podtverzhdenie_na_uchastieLocalService,
		ServiceWrapper<podtverzhdenie_na_uchastieLocalService> {
	public podtverzhdenie_na_uchastieLocalServiceWrapper(
		podtverzhdenie_na_uchastieLocalService podtverzhdenie_na_uchastieLocalService) {
		_podtverzhdenie_na_uchastieLocalService = podtverzhdenie_na_uchastieLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _podtverzhdenie_na_uchastieLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _podtverzhdenie_na_uchastieLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _podtverzhdenie_na_uchastieLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_na_uchastieLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_na_uchastieLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of podtverzhdenie_na_uchasties.
	*
	* @return the number of podtverzhdenie_na_uchasties
	*/
	@Override
	public int getpodtverzhdenie_na_uchastiesCount() {
		return _podtverzhdenie_na_uchastieLocalService.getpodtverzhdenie_na_uchastiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _podtverzhdenie_na_uchastieLocalService.getOSGiServiceIdentifier();
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
		return _podtverzhdenie_na_uchastieLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _podtverzhdenie_na_uchastieLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _podtverzhdenie_na_uchastieLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the podtverzhdenie_na_uchasties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_na_uchasties
	* @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	* @return the range of podtverzhdenie_na_uchasties
	*/
	@Override
	public java.util.List<tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie> getpodtverzhdenie_na_uchasties(
		int start, int end) {
		return _podtverzhdenie_na_uchastieLocalService.getpodtverzhdenie_na_uchasties(start,
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
		return _podtverzhdenie_na_uchastieLocalService.dynamicQueryCount(dynamicQuery);
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
		return _podtverzhdenie_na_uchastieLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the podtverzhdenie_na_uchastie to the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie that was added
	*/
	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie addpodtverzhdenie_na_uchastie(
		tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		return _podtverzhdenie_na_uchastieLocalService.addpodtverzhdenie_na_uchastie(podtverzhdenie_na_uchastie);
	}

	/**
	* Creates a new podtverzhdenie_na_uchastie with the primary key. Does not add the podtverzhdenie_na_uchastie to the database.
	*
	* @param podtverzhdenie_na_uchastie_id the primary key for the new podtverzhdenie_na_uchastie
	* @return the new podtverzhdenie_na_uchastie
	*/
	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie createpodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id) {
		return _podtverzhdenie_na_uchastieLocalService.createpodtverzhdenie_na_uchastie(podtverzhdenie_na_uchastie_id);
	}

	/**
	* Deletes the podtverzhdenie_na_uchastie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie that was removed
	* @throws PortalException if a podtverzhdenie_na_uchastie with the primary key could not be found
	*/
	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie deletepodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_na_uchastieLocalService.deletepodtverzhdenie_na_uchastie(podtverzhdenie_na_uchastie_id);
	}

	/**
	* Deletes the podtverzhdenie_na_uchastie from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie that was removed
	*/
	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie deletepodtverzhdenie_na_uchastie(
		tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		return _podtverzhdenie_na_uchastieLocalService.deletepodtverzhdenie_na_uchastie(podtverzhdenie_na_uchastie);
	}

	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie fetchpodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id) {
		return _podtverzhdenie_na_uchastieLocalService.fetchpodtverzhdenie_na_uchastie(podtverzhdenie_na_uchastie_id);
	}

	/**
	* Returns the podtverzhdenie_na_uchastie with the primary key.
	*
	* @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie
	* @throws PortalException if a podtverzhdenie_na_uchastie with the primary key could not be found
	*/
	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie getpodtverzhdenie_na_uchastie(
		long podtverzhdenie_na_uchastie_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_na_uchastieLocalService.getpodtverzhdenie_na_uchastie(podtverzhdenie_na_uchastie_id);
	}

	/**
	* Updates the podtverzhdenie_na_uchastie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie that was updated
	*/
	@Override
	public tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie updatepodtverzhdenie_na_uchastie(
		tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		return _podtverzhdenie_na_uchastieLocalService.updatepodtverzhdenie_na_uchastie(podtverzhdenie_na_uchastie);
	}

	@Override
	public podtverzhdenie_na_uchastieLocalService getWrappedService() {
		return _podtverzhdenie_na_uchastieLocalService;
	}

	@Override
	public void setWrappedService(
		podtverzhdenie_na_uchastieLocalService podtverzhdenie_na_uchastieLocalService) {
		_podtverzhdenie_na_uchastieLocalService = podtverzhdenie_na_uchastieLocalService;
	}

	private podtverzhdenie_na_uchastieLocalService _podtverzhdenie_na_uchastieLocalService;
}