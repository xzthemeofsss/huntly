package com.huntly.server.domain.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@Table(name = "page")
@DynamicUpdate
public class Page implements Serializable {

    private static final long serialVersionUID = -7326920334191810988L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "source_id")
    private Integer sourceId;

    @Column(name = "connector_id")
    private Integer connectorId;

    @Column(name = "connector_type")
    private Integer connectorType;
    
    @Column(name = "folder_id")
    private Integer folderId;

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String url;

    @Column(name = "url_without_hash")
    private String urlWithoutHash;

    @Column(name = "page_unique_id")
    private String pageUniqueId;

    @Column(name = "is_show_on_page_list")
    private Boolean showOnPageList;
    
    //@Column(name = "pub_date")
    //private String pubDate;

    @Column(name = "description")
    private String description;

    @Column(name = "author")
    private String author;

    @Column(name = "language")
    private String language;

    @Column(name = "category")
    private String category;

    @Column(name = "content")
    private String content;

    @Column(name = "content_type")
    private Integer contentType;
    
    @Column(name = "read_count")
    private Integer readCount;

    @Column(name = "read_cost_seconds")
    private Long readCostSeconds;

    @Column(name = "created_at")
    private Instant createdAt;
    
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "first_read_at")
    private Instant firstReadAt;

    @Column(name = "last_read_at")
    private Instant lastReadAt;

    @Column(name = "starred_at")
    private Instant starredAt;

    @Column(name = "read_later_at")
    private Instant readLaterAt;

    @Column(name = "archived_at")
    private Instant archivedAt;
    
    @Column(name = "saved_at")
    private Instant savedAt;

    @Column(name = "connected_at")
    private Instant connectedAt;

    @Column(name = "is_starred")
    private Boolean starred;

    @Column(name = "is_read_later")
    private Boolean readLater;

    @Column(name = "is_mark_read")
    private Boolean markRead;

    @Column(name = "library_save_status")
    private Integer librarySaveStatus;

    @Column(name = "thumb_url")
    private String thumbUrl;
    
    @Column(name="page_json_properties")
    private String pageJsonProperties;

    @Transient
    private String contentText;
}