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

package tj.revision.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link revisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see revisionLocalService
 * @generated
 */
@ProviderType
public class revisionLocalServiceWrapper implements revisionLocalService,
	ServiceWrapper<revisionLocalService> {
	public revisionLocalServiceWrapper(
		revisionLocalService revisionLocalService) {
		_revisionLocalService = revisionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _revisionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _revisionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _revisionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _revisionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _revisionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of revisions.
	*
	* @return the number of revisions
	*/
	@Override
	public int getrevisionsCount() {
		return _revisionLocalService.getrevisionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _revisionLocalService.getOSGiServiceIdentifier();
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
		return _revisionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.revision.model.impl.revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _revisionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.revision.model.impl.revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _revisionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the revisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.revision.model.impl.revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of revisions
	* @param end the upper bound of the range of revisions (not inclusive)
	* @return the range of revisions
	*/
	@Override
	public java.util.List<tj.revision.model.revision> getrevisions(int start,
		int end) {
		return _revisionLocalService.getrevisions(start, end);
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
		return _revisionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _revisionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the revision to the database. Also notifies the appropriate model listeners.
	*
	* @param revision the revision
	* @return the revision that was added
	*/
	@Override
	public tj.revision.model.revision addrevision(
		tj.revision.model.revision revision) {
		return _revisionLocalService.addrevision(revision);
	}

	/**
	* Creates a new revision with the primary key. Does not add the revision to the database.
	*
	* @param revision_id the primary key for the new revision
	* @return the new revision
	*/
	@Override
	public tj.revision.model.revision createrevision(long revision_id) {
		return _revisionLocalService.createrevision(revision_id);
	}

	/**
	* Deletes the revision with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param revision_id the primary key of the revision
	* @return the revision that was removed
	* @throws PortalException if a revision with the primary key could not be found
	*/
	@Override
	public tj.revision.model.revision deleterevision(long revision_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _revisionLocalService.deleterevision(revision_id);
	}

	/**
	* Deletes the revision from the database. Also notifies the appropriate model listeners.
	*
	* @param revision the revision
	* @return the revision that was removed
	*/
	@Override
	public tj.revision.model.revision deleterevision(
		tj.revision.model.revision revision) {
		return _revisionLocalService.deleterevision(revision);
	}

	@Override
	public tj.revision.model.revision fetchrevision(long revision_id) {
		return _revisionLocalService.fetchrevision(revision_id);
	}

	/**
	* Returns the revision with the primary key.
	*
	* @param revision_id the primary key of the revision
	* @return the revision
	* @throws PortalException if a revision with the primary key could not be found
	*/
	@Override
	public tj.revision.model.revision getrevision(long revision_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _revisionLocalService.getrevision(revision_id);
	}

	/**
	* Updates the revision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param revision the revision
	* @return the revision that was updated
	*/
	@Override
	public tj.revision.model.revision updaterevision(
		tj.revision.model.revision revision) {
		return _revisionLocalService.updaterevision(revision);
	}

	@Override
	public revisionLocalService getWrappedService() {
		return _revisionLocalService;
	}

	@Override
	public void setWrappedService(revisionLocalService revisionLocalService) {
		_revisionLocalService = revisionLocalService;
	}

	private revisionLocalService _revisionLocalService;
}